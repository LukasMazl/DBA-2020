package cz.tul.dba.dto.in;

import cz.tul.dba.blogic.service.machine.ColumnValue;

import java.util.List;

public class GetRecordsForMachineDTO {
    private String vin;
    private List<ColumnValue> columnValueList;
    private Integer pages;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public List<ColumnValue> getColumnValueList() {
        return columnValueList;
    }

    public void setColumnValueList(List<ColumnValue> columnValueList) {
        this.columnValueList = columnValueList;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
