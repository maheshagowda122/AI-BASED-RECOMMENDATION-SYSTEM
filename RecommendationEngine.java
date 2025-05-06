package com.codetech;

import org.apache.mahout.cf.taste.eval.DataModelBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.util.List;

public class RecommendationEngine {
    public static void main(String[] args) {
        try {
            // Load data model from CSV file
            File file = new File("data.csv");
            DataModel model = new FileDataModel(new File("data.csv"));

            // Compute user similarity using Pearson correlation
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Define neighborhood (how many similar users to consider)
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

            // Create user-based recommender
            Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Recommend items for all users
            for (LongPrimitiveIterator users = model.getUserIDs(); users.hasNext(); ) {
                long userId = users.nextLong();
                List<RecommendedItem> recommendations = recommender.recommend(userId, 2);

                System.out.println("User " + userId + " recommendations:");
                for (RecommendedItem recommendation : recommendations) {
                    System.out.println("  Item: " + recommendation.getItemID() + 
                                       " | Estimated preference: " + recommendation.getValue());
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

