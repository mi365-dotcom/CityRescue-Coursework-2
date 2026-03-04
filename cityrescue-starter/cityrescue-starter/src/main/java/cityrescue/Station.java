package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public class Station {
        // Unique ID for the station
        int id;
        // x and y position on the 2d array of the grid
        int x;
        int y;
        // Name of the station
        String name;
        // maximum capacity of the station
        int maxUnits = 1;
        int unitCount = 0;

        // Static counter that gives each station a unique ID
        public static int nextStationID = 1;

        Station(int x, int y, String name, int maxUnits) {
            // The next station after would always be 1 larger
            // than the prior station
            // getters
            this.id = nextStationID++;
            this.x = x;
            this.y = y;
            this.name = name;
            this.maxUnits = maxUnits;

        }
    }