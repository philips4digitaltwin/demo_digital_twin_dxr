package com.philips.hc.iap.svc.digitaltwin.service;

import com.philips.hc.iap.svc.digitaltwin.model.*;

public interface DTwinService {

    public DTwin saveDTwin(DTwin dTwin);
    public DTwinBattery saveDTwinBattery(DTwinBattery dTwin);
    public DTwinDetector saveDTwinDetector(DTwinDetector dTwin);
    public DtwinDetectorWIFI saveDtwinDetectorWIFI(DtwinDetectorWIFI dTwin);



    public DTwinDetectorCalibration saveDTwinDetectorCalibration(DTwinDetectorCalibration dTwinDetectorCalibration);
}
