package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public class Incident {
        // Incident id
        int id;
        // Incident position x and y
        int x;
        int y;
        // What type of incident it is
        IncidentType type;
        // What status the incident is
        IncidentStatus status;
        // Severity of the incident
        int severity;
        // Unit assigned to incident
        int assignedUnitId = -1;
        public static int nextIncidentID = 1;

        Incident(int severity, int x, int y, IncidentType type){
            this.id = nextIncidentID++;
            this.severity = severity;
            this.type = type;
            this.x = x;
            this.y = y;
            this.status = IncidentStatus.REPORTED;
        }
    }
