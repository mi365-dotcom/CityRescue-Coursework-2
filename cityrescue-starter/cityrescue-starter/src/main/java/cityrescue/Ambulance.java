package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public class Ambulance extends Unit {

    public Ambulance(int homeStationId, int x, int y) {
        super(homeStationId, x, y, UnitType.AMBULANCE);
    }

    @Override
    boolean canHandle(IncidentType type) {
        return type == IncidentType.MEDICAL;
    }

    @Override
    int getTicksToResolve(int severity) {
        return 2;
    }
}

