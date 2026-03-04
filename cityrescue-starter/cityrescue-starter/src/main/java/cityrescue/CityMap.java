package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public class CityMap {
        // Grid width
        public final int width;
        // Grid height 
        public final int height;
        /* 2D grid of obstacles
        TRUE = blocked
        FALSE = free */
        public final boolean[][] obstacles;

        // Constructor that constructs a new 
        // CityMap with the given dimensions
        CityMap(int width, int height) {
            this.width = width;
            this.height = height;
            obstacles = new boolean[width][height];
        }

         // Checks if the users input (x, y) for an obstacle is valid
         // and within the grid boundaries
        public boolean isInBounds(int x, int y) {
            return x >= 0 && x < width && y >= 0 && y < height;
        }

        // Returns true if cell is blocked
        boolean isBlocked(int x, int y) {
            return obstacles[x][y];
        }
        // Marks the cell as blocked
        void addObstacle(int x, int y) {
            obstacles[x][y] = true;
        }
        // Removes obstacle from the cell
        void removeObstacle(int x, int y) {
            obstacles[x][y] = false;
        }
        // Counts all obstacles within the 2D array
        int countObstacles() {
            int c = 0;
            for (int i = 0; i < width; i++)
                for (int j = 0; j < height; j++)
                    if (obstacles[i][j]) c++;
            return c;
        }
    }