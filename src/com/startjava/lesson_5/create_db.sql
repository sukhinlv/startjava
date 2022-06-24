DROP DATABASE jagers;
CREATE DATABASE jagers;
\c jagers
CREATE TABLE IF NOT EXISTS jagers (
    jager_id    SERIAL          PRIMARY KEY,
    modelName   TEXT            UNIQUE NOT NULL,
    mark        TEXT            NOT NULL,
    height      NUMERIC         NOT NULL, 
    weight      NUMERIC         NOT NULL, 
    status      BOOL            NOT NULL DEFAULT true,
    origin      TEXT            NOT NULL,
    launch      DATE            NOT NULL,
    kaijuKill   INT             DEFAULT 0
 ); 
