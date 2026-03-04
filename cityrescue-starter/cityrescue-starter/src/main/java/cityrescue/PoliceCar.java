package cityrescue;

import cityrescue.enums.*;
import cityrescue.exceptions.*;

public class PoliceCar extends Unit {

    public PoliceCar(int homeStationId, int x, int y) {
        super(homeStationId, x, y, UnitType.POLICE_CAR);
    }

    @Override
    boolean canHandle(IncidentType type) {
        return type == IncidentType.CRIME;
    }

    @Override
    int getTicksToResolve(int severity) {
        return 3;   // medium resolution time
    }
}