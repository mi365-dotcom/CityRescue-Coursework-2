package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public class FireEngine extends Unit {

    public FireEngine(int homeStationId, int x, int y) {
        super(homeStationId, x, y, UnitType.FIRE_ENGINE);
    }

    @Override
    boolean canHandle(IncidentType type) {
        return type == IncidentType.FIRE;
    }

    @Override
    int getTicksToResolve(int severity) {
        return 4;   // longest resolution time
    }
}