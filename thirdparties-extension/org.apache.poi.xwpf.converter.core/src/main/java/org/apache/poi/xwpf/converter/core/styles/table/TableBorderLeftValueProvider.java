package org.apache.poi.xwpf.converter.core.styles.table;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;

public class TableBorderLeftValueProvider
    extends AbstractTableBorderValueProvider
{

    public static final TableBorderLeftValueProvider INSTANCE = new TableBorderLeftValueProvider();

    @Override
    public CTBorder getBorder( CTTblBorders borders )
    {
        return borders.getLeft();
    }

}
