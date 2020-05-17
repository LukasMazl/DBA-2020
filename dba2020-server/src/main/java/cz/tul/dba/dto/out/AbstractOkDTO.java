package cz.tul.dba.dto.out;

public abstract class AbstractOkDTO {
    private boolean ok;

    public AbstractOkDTO() {

    }

    public AbstractOkDTO(boolean isOk) {
        this.ok = isOk;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
}
