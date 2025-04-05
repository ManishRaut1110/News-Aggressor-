package com.example.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML private TextArea inputText;
    @FXML private Label resultLabel;

    final SentimentAnalyzer analyzer = new SentimentAnalyzer();

    @FXML
    private void analyzeText() {
        String input = inputText.getText();
        if (input == null || input.trim().isEmpty()) {
            resultLabel.setText("Please enter some news text.");
        } else {
            String sentiment = analyzer.analyzeSentiment(input);
            resultLabel.setText("Detected Sentiment: " + sentiment);
        }
    }
}
