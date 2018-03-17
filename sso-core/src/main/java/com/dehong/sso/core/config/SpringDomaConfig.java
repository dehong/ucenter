package com.dehong.sso.core.config;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.dialect.Db2Dialect;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.dialect.Mssql2008Dialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;
import org.seasar.doma.jdbc.dialect.OracleDialect;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SpringDomaConfig implements Config, InitializingBean 
{
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	private Dialect dialect;

	@Value("${jdbc.dbtype}")
	private String dbType;

	public SpringDomaConfig() {}

	@Override
	public DataSource getDataSource() 
	{
		return dataSource;
	}

	@Override
	public Dialect getDialect() 
	{
		return dialect;
	}

	@Override
	public JdbcLogger getJdbcLogger()
	{
		return new Slf4jJdbcLogger();
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		if ("oracle".equalsIgnoreCase(dbType))
			dialect = new OracleDialect();
		else if ("mysql".equalsIgnoreCase(dbType))
			dialect = new MysqlDialect();
		else if ("db2".equalsIgnoreCase(dbType))
			dialect = new Db2Dialect();
		else if ("h2".equalsIgnoreCase(dbType))
			dialect = new H2Dialect();
		else if ("sqlserver".equalsIgnoreCase(dbType))
			dialect = new Mssql2008Dialect();
		else
			throw new Exception("Unsupported database type.");
	}
}
