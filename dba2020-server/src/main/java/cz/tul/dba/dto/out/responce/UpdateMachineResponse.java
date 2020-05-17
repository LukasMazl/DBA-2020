package cz.tul.dba.dto.out.responce;

import cz.tul.dba.dto.out.AbstractOkDTO;

public class UpdateMachineResponse extends AbstractOkDTO {

    public UpdateMachineResponse(boolean isOk) {
        super(isOk);
    }
}
