package cn.beyond.beyond.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;

/**
 * w 生成word文档
 */
public class WordReporter {

	private XWPFDocument xwpfDocument = new XWPFDocument();

	public XWPFDocument getXwpfDocument() {
		return xwpfDocument;
	}
	public void setXwpfDocument(XWPFDocument xwpfDocument) {
		this.xwpfDocument = xwpfDocument;
	}

	/**
	 * 导出word方法
	 * @return boolean
	 * @throws Exception
	 */
	/*public void exportNew(List<DatabaseTableInfo> databaseTableInfos) throws Exception {
		// 新建一个文档
		this.insertValueToNewTable(xwpfDocument, databaseTableInfos);
	}*/

	/**
	 * 循环填充表格内容
	 * 
	 * @param xwpfDocument
	 *            处理类
	 *            后台数据
	 * @param tableIndex
	 *            表
	 * @throws Exception
	 */
	/*private void insertValueToNewTable(XWPFDocument xwpfDocument,List<DatabaseTableInfo> databaseTableInfos ) throws Exception {
		int count = 1;
		int tableCells = 5;
		// 创建所有表
		for (int i = 0; i < databaseTableInfos.size(); i++) {
			DatabaseTableInfo databaseTableInfo = databaseTableInfos.get(i);
			int tableRows = databaseTableInfos.get(i).getColumnInfos().size() + 1;
			XWPFParagraph createParagraph = xwpfDocument.createParagraph();
			XWPFRun xwpfRun = createParagraph.createRun();
			setPara(xwpfRun, null);
			String tablePrefix = databaseTableInfo.getDataSource().getTablePrefix();
			String description = databaseTableInfos.get(i).getDescription() == null ? "" : databaseTableInfos.get(i).getDescription();
			if (StringUtils.isNotBlank(tablePrefix)) {
				xwpfRun.setText((count++) + "、" + tablePrefix + "_" + databaseTableInfos.get(i).getTableName()
						+ "(" + description + ")");
			}else {
				xwpfRun.setText((count++) + "、" + databaseTableInfos.get(i).getTableName()
						+ "(" + description + ")");
			}
			XWPFTable xwpfTable = xwpfDocument.createTable(tableRows, tableCells);// 创建表
			setTableStyle(xwpfTable);
		}
		List<XWPFTable> tableList = xwpfDocument.getTables();
		// 给所有表设置第一行信息
		for (XWPFTable xwpfTable : tableList) {
			List<XWPFTableCell> firstCells = xwpfTable.getRows().get(0).getTableCells();
			for (XWPFTableCell xwpfTableCell : firstCells) {
				xwpfTableCell.setColor("DEDEDE");
			}
			firstCells.get(0).setText("字段名称");
			firstCells.get(1).setText("类型");
			firstCells.get(2).setText("长度");
			firstCells.get(3).setText("标识");
			firstCells.get(4).setText("描述");
		}
		// 循环给表格添加数据
		for (int i = 0; i < tableList.size(); i++) {
			XWPFTable xwpfTable = tableList.get(i);
			List<XWPFTableRow> rows = xwpfTable.getRows();
			for (int j = 1; j < rows.size(); j++) {//第二行添加
				XWPFTableRow xwpfTableRow = rows.get(j);
				List<XWPFTableCell> tableCellss = xwpfTableRow.getTableCells();
				for (int k = 0; k < tableCellss.size(); k++) {
					XWPFTableCell xwpfTableCell = tableCellss.get(k);
					 DatabaseColumnInfo columnInfo = databaseTableInfos.get(i).getColumnInfos().get(j-1);
					if (k == 0) {// 字段名称
						xwpfTableCell.setText(columnInfo.getColumnName());
					} else if (k == 1) {// 字段类型
						xwpfTableCell.setText(columnInfo.getType());
					} else if (k == 2) {// 字段长度
						xwpfTableCell.setText(columnInfo.getSize().toString());
					} else if (k == 4) {// 字段描述
						xwpfTableCell.setText(columnInfo.getDescription());
					} else if (k == 3) {// 字段标识
						xwpfTableCell.setText(columnInfo.isPrimaryKey()?"主键":"");
					}

				}
			}
		}

	}*/

	
	/**
	 * 设置单元格的样式
	 */
	public void setTableStyle(XWPFTable xwpfTable) {
		xwpfTable.getCTTbl().addNewTblPr().addNewJc().setVal(STJc.LEFT);
		List<XWPFTableRow> rows = xwpfTable.getRows();
		for (XWPFTableRow xwpfTableRow : rows) {
			xwpfTableRow.setHeight(350);
			List<XWPFTableCell> tableCells = xwpfTableRow.getTableCells();
			for (int i = 0; i < tableCells.size(); i++) {
				XWPFTableCell xwpfTableCell = tableCells.get(i);
				CTTcPr cellpr = xwpfTableCell.getCTTc().addNewTcPr();
				cellpr.addNewVAlign().setVal(STVerticalJc.CENTER);
				if (i == 2) {
					cellpr.addNewTcW().setW(BigInteger.valueOf(700));
				}else if (i == 3) {
					cellpr.addNewTcW().setW(BigInteger.valueOf(1200));
				}else if (i == 4) {
					cellpr.addNewTcW().setW(BigInteger.valueOf(2600));
				}else {
					cellpr.addNewTcW().setW(BigInteger.valueOf(2000));
				}
			}
		}
	}

	/**
	 * 关闭输入流
	 * @param is
	 */
	private void close(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭输出流
	 * @param os
	 */
	private void close(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 输出文件
	 * @param outputStream
	 * @throws IOException
	 */
	public void generate(OutputStream outputStream) throws IOException {
		if (outputStream != null) {
			xwpfDocument.write(outputStream);
			this.close(outputStream);
		}
	}

	
	/**
	 * 数据文档
	 * @param list
	 * @throws Exception
	 */
	public void exportSecond(List<List<Map<String,Object>>> list) throws Exception {
		this.insertValueToWord(xwpfDocument, list);
	}
	
	private void insertValueToWord(XWPFDocument xwpfDocument, List<List<Map<String,Object>>> list) throws Exception {
		int count = 1;
		int tableCells = 5;
		//生成表格
		for (int i = 0; i < list.size(); i++) {
			int tableRows = list.get(i).size();
			String tableName = list.get(i).get(0).get("tableName").toString();
			String tableComment = "";
			if (Objects.nonNull( list.get(i).get(0).get("tableComment"))) {
				tableComment = list.get(i).get(0).get("tableComment").toString();
			}
			XWPFParagraph createParagraph = xwpfDocument.createParagraph();
			createParagraph.setAlignment(ParagraphAlignment.LEFT);
			String testString = (count++) + "、" + tableComment + " ( " + tableName + " ) ";
			XWPFRun createRun = createParagraph.createRun();
			setPara(createRun,testString);
			XWPFTable xwpfTable = xwpfDocument.createTable(tableRows, tableCells);
			setTableStyle(xwpfTable);
		}
		//抬头名称
		List<XWPFTable> tableList = xwpfDocument.getTables();
		for (XWPFTable xwpfTable : tableList) {
			List<XWPFTableCell> firstCells = xwpfTable.getRows().get(0).getTableCells();
			for (XWPFTableCell xwpfTableCell : firstCells) {
				xwpfTableCell.setColor("DEDEDE");
			}
			firstCells.get(0).setText("列名");
			firstCells.get(1).setText("类型长度");
			firstCells.get(2).setText("主键");
			firstCells.get(3).setText("非空");
			firstCells.get(4).setText("说明");
			
		}
		//表格数据
		for (int i = 0; i < tableList.size(); i++) {
			XWPFTable xwpfTable = tableList.get(i);
			List<XWPFTableRow> rows = xwpfTable.getRows();
			for (int j = 1; j < rows.size(); j++) {
				XWPFTableRow xwpfTableRow = rows.get(j);
				List<XWPFTableCell> tableCellss = xwpfTableRow.getTableCells();
				for (int k = 0; k < tableCellss.size(); k++) {
					XWPFTableCell xwpfTableCell = tableCellss.get(k);
					Map<String, Object> map = list.get(i).get(j);
					if (k == 0) {
						xwpfTableCell.setText((String) map.get("columnName"));
					} else if (k == 1) {
						xwpfTableCell.setText((String) map.get("columnType"));
					} else if (k == 2) {
						xwpfTableCell.setText((String) map.get("columnKey"));
					} else if (k == 3) {
						xwpfTableCell.setText((String) map.get("isNullable"));
					} else if (k == 4) {
						xwpfTableCell.setText((String) map.get("columnComment"));
					}
				}
			}
		}
	}
	
	/**
	 * 段落设置
	 * @param createRun
	 * @param Text
	 */
	private void setPara(XWPFRun createRun,String Text) {
		createRun.setBold(true);
		createRun.setFontSize(12);
		createRun.setText(Text);
	}
	
}
