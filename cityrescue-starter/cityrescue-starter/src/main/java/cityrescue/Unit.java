package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public abstract class Unit {
        // Unit id
        int id;
        // Unit position x and y
        int x;
        int y;
        // What type of unit it is
        UnitType type;
        // What status the unit is
        UnitStatus status;
        // The ID of the station it comes from
        int homeStationId;
        // Assigned default incident ID
        int incidentId = -1;
        private static int nextUnitID = 1;
        // remaining incident ticks
        int iTR = 0;


        // Constructor used by subclasses 
        Unit(int homeStationId, int x, int y, UnitType type){
            this.id = nextUnitID++;
            this.homeStationId = homeStationId;
            this.type = type;
            this.x = x;
            this.y = y;
            this.status = UnitStatus.IDLE;
            
            
        }

        // Determines if the unit can handle the given incident type
        abstract boolean canHandle(IncidentType type);
        
        // ticks required to resolve the incident occuring
        abstract int getTicksToResolve(int severity);
    }

    