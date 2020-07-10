package cn.beyond.beyond.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Execept {

	
	
	@Resource(name = "secondDatasource")
	private DataSource secondDatasource;
	
	/**
	 * 
	 * @Author Wulf
	 * @return List<List<Map<String,Object>>>
	 * @Description TODO(传参数据库连接地址，tableSchema，tableName)
	 */
	public List<?> exportDatabase(DataSource datasource, String dataSchema, String tableName) {

		// 存储所有表数据
		List<?> allDataList = new ArrayList<>();
		Map<String,Object> map = new HashMap<>();
		//数据源不为空并且连接有效
		if (Objects.nonNull(datasource)) {
			
			 NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(secondDatasource);
			if (StringUtils.isNotBlank(dataSchema)) {
				
				if (StringUtils.isNotBlank(tableName)) {
					String tableSql = "SELECT TABLE_NAME,TABLE_COMMENT,COLUMN_NAME ,COLUMN_TYPE,COLUMN_COMMENT,COLUMN_KEY,IS_NULLABLE FROM information_schema.`COLUMNS` b WHERE\r\n"
							+ "b.table_schema = '"+ dataSchema +"' and b.table_name = 'u_user'";
					List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(tableSql, map);
					for (Map<String, Object> map2 : queryForList) {
						Object object = map2.get("TABLE_NAME");
						
					}
					
				}else {
					String baseSql = "SELECT TABLE_NAME,TABLE_COMMENT FROM information_schema.`TABLES`  a WHERE a.table_schema = '"
							+ dataSchema + "'";
					List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(baseSql, map);
					for (Map<String, Object> map2 : queryForList) {
						Map<String, Object> tableMap = new HashMap<>();
						//名称描述及列对象
						Object object = map2.get("TABLE_NAME");
						Object ww = map2.get("TABLE_COMMENT");
						String tableSql = "SELECT COLUMN_NAME ,COLUMN_TYPE,COLUMN_COMMENT,COLUMN_KEY,IS_NULLABLE FROM information_schema.`COLUMNS` b WHERE\r\n"
							+ "b.table_schema = '"+ dataSchema +"' and b.table_name = 'u_user'";
						List<Map<String, Object>> queryForList2 = jdbcTemplate.queryForList(tableSql, map);
						List<Map<String, Object>> list = new ArrayList<>();
						//创建map对象存储数据
						for (Map<String, Object> map3 : queryForList) {
							//单例属性
							Map<String, Object> columnMap = new HashMap<>();
							Object object3 = map3.get("COLUMN_NAME");
							columnMap.put("COLUMN_NAME", object3);
							list.add(columnMap);
						}
					}
				}
			} else {
				String sql = "show databases";
				List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql, map);
				for (Map<String, Object> map2 : queryForList) {
					String data = (String) map.get("Database");
					String baseSql = "SELECT TABLE_NAME,TABLE_COMMENT FROM information_schema.`TABLES`  a WHERE a.table_schema = 'yhjr_postloan'";
				}
			}
		} else {
			log.info("数据源为空/数据源连接失败");
		}
		return allDataList;
	}
}
