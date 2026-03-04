package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public class CityMap {
        public final int width;
        public final int height;
        public final boolean[][] obstacles;

        CityMap(int width, int height) {
            this.width = width;
            this.height = height;
            obstacles = new boolean[width][height];
        }

         // Checks if the users input (x, y) for an obstacle is valid
        public boolean isInBounds(int x, int y) {
            // Returns true if x and y are within the height
            // and width of the initalized grid and also
            // returns false if the coordinate is not valid
            return x >= 0 && x < width && y >= 0 && y < height;
        }


        boolean isBlocked(int x, int y) {
            return obstacles[x][y];
        }

        void addObstacle(int x, int y) {
            obstacles[x][y] = true;
        }

        void removeObstacle(int x, int y) {
            obstacles[x][y] = false;
        }

        int countObstacles() {
            int c = 0;
            for (int i = 0; i < width; i++)
                for (int j = 0; j < height; j++)
                    if (obstacles[i][j]) c++;
            return c;
        }
    }