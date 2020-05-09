package cz.tul.dba.dto.out;

public abstract class AbstractOkDTO {
    private boolean ok;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
}
