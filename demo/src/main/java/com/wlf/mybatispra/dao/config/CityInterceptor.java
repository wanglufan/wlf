package com.wlf.mybatispra.dao.config;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import com.wlf.mybatispra.bean.City;

@Component
@Intercepts({ @Signature(type = Executor.class, method = "update", args = { MappedStatement.class, Object.class }) })
//,@Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class,RowBounds.class, ResultHandler.class })
public class CityInterceptor implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		Object[] args = invocation.getArgs();
		SqlCommandType methodType = ((MappedStatement) args[0]).getSqlCommandType();

		int len = args.length;
		if (methodType == SqlCommandType.INSERT) {
			for (int i = 1; i < len; i++) {
				insertHadle(args[i]);
			}
		} else if (methodType == SqlCommandType.UPDATE) {
			for (int i = 1; i < len; i++) {
				updateHadle(args[i]);
			}
		}

		return invocation.proceed();
	}

	private void insertHadle(Object obj) {
		if (obj instanceof City) {
			((City) obj).setDescription("insert");
		}
	}

	private void updateHadle(Object obj) {
		if (obj instanceof City) {
			((City) obj).setDescription("fuckme");
		}
	}

	@Override
	public Object plugin(Object o) {
		if (o instanceof Executor) {
			return Plugin.wrap(o, this);
		}
		return o;
	}

	@Override
	public void setProperties(Properties properties) {
		System.out.println("LogInterceptor : setProperties");
	}
}
