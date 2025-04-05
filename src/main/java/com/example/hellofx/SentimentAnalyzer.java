package com.example.hellofx;

import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;

import java.util.Properties;

public class SentimentAnalyzer {
    final StanfordCoreNLP pipeline;

    public SentimentAnalyzer() {
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize,ssplit,pos,parse,sentiment");
    
        // Load the POS model manually
        String modelPath = getClass().getResource("/models/english-left3words-distsim.tagger").toString();
        props.setProperty("pos.model", modelPath);
    
        pipeline = new StanfordCoreNLP(props);
    }
    

    public String analyzeSentiment(String text) {
        Annotation annotation = new Annotation(text);
        pipeline.annotate(annotation);

        for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
            return sentence.get(SentimentCoreAnnotations.SentimentClass.class);
        }
        return "Neutral";
    }
}