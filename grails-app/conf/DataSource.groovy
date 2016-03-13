
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    //cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory'
}

// environment specific settings
environments {
    development{
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect
            // Config pour MySQL
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost:3306/deezee_dev?autoreconnect=true"
            username = "appuser"
            password = "appuser"
            pooled = true
            properties {
                // see http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
                // and https://tomcat.apache.org/tomcat-7.0-doc/api/org/apache/tomcat/jdbc/pool/PoolConfiguration.html#setTimeBetweenEvictionRunsMillis(int)
                maxActive = 30 // The maximum number of active connections that can be allocated from this pool at the same time.
                minIdle = 1 // The minimum number of established connections that should be kept in the pool at all times.
                numTestsPerEvictionRun = 3 // Property not used
                testOnBorrow = true // The indication of whether objects will be validated before being borrowed from the pool.
                testWhileIdle = true // Set to true if query validation should take place while the connection is idle.
                testOnReturn = true // The indication of whether objects will be validated after being returned to the pool.
                validationQuery = "SELECT 1" // The SQL query that will be used to validate connections from this pool before returning them to the caller or pool.
                minEvictableIdleTimeMillis = 60000  // 60 seconds, The minimum amount of time an object must sit idle in the pool before it is eligible for eviction.
                timeBetweenEvictionRunsMillis = 5000 // 5 seconds, The number of milliseconds to sleep between runs of the idle connection validation, abandoned cleaner and idle pool resizing.
                jmxEnabled = true // If set to true, the connection pool creates a ConnectionPoolMBean object that can be registered with JMX to receive notifications and state about the pool.
                // See https://www.mulesoft.com/tcat/tomcat-jmx  or http://www.mkyong.com/tomcat/jconsole-jmx-remote-access-on-tomcat or http://tomcat.apache.org/tomcat-7.0-doc/monitoring.html
                initialSize = 6 // Returns the number of connections that will be established when the connection pool is started.
                maxIdle = 25  // The maximum number of connections that should be kept in the idle pool if isPoolSweeperEnabled() returns false.
                maxWait = 10000  // 10 seconds, The maximum number of milliseconds that the pool will wait (when there are no available connections and the getMaxActive() has been reached) for a connection to be returned before throwing an exception.
                maxAge = 10 * 60000  // 10 mns,  Time in milliseconds to keep this connection alive even when used.
                validationQueryTimeout = 3 // The timeout in seconds before a connection validation queries fail.
                validationInterval = 30000 // 30 seconds,  avoid excess validation, only run validation at most at this frequency - time in milliseconds.
                jdbcInterceptors = "ConnectionState;StatementCache(max=200)" // A semicolon separated list of classnames extending JdbcInterceptor class.
                defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED   // safe default
                logAbandoned = false // causes stacktrace recording overhead, use only for debugging
                // JDBC driver properties
                // Mysql as example
                dbProperties {
                    // Mysql specific driver properties
                    // http://dev.mysql.com/doc/connector-j/en/connector-j-reference-configuration-properties.html
                    // let Tomcat JDBC Pool handle reconnecting
                    autoReconnect=false
                    // truncation behaviour
                    jdbcCompliantTruncation=false
                    // mysql 0-date conversion
                    zeroDateTimeBehavior='convertToNull'
                    // Tomcat JDBC Pool's StatementCache is used instead, so disable mysql driver's cache
                    cachePrepStmts=false
                    cacheCallableStmts=false
                    // Tomcat JDBC Pool's StatementFinalizer keeps track
                    dontTrackOpenResources=true
                    // performance optimization: reduce number of SQLExceptions thrown in mysql driver code
                    holdResultsOpenOverStatementClose=true
                    // enable MySQL query cache - using server prep stmts will disable query caching
                    useServerPrepStmts=false
                    // metadata caching
                    cacheServerConfiguration=true
                    cacheResultSetMetadata=true
                    metadataCacheSize=100
                    // timeouts for TCP/IP
                    connectTimeout=15000
                    socketTimeout=120000
                    // timer tuning (disable)
                    maintainTimeStats=false
                    enableQueryTimeouts=false
                    // misc tuning
                    noDatetimeStringSync=true
                }

            }
        }
    }
    production{
        dataSource {
            pooled = true
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "appuser"
            password = "mm26xt22"
            url = "jdbc:mysql://aa1oc4dvkid0xu5.cxcocses77mv.us-east-1.rds.amazonaws.com:3306/ebdb"
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect
            properties {
                validationQuery = "SELECT 1"
                testOnBorrow = true
                testOnReturn = true
                testWhileIdle = true
                timeBetweenEvictionRunsMillis = 1000 * 60 * 30
                numTestsPerEvictionRun = 3
                minEvictableIdleTimeMillis = 1000 * 60 * 30
            }
        }
    }
}
