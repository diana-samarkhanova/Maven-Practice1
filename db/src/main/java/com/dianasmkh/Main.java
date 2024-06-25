package com.dianasmkh;

import java.util.UUID;

public class Main {
    public class Db {

        private DbSetting dbSetting;
        private MyEntity myEntity;

        public Db(DbSetting dbSetting) {
            this.dbSetting = dbSetting;
            myEntity = new MyEntity("first");
            myEntity.setId(UUID.randomUUID());
        }

        public DbSetting getDbSetting() {
            return dbSetting;
        }

        public MyEntity getMyEntity() {
            return myEntity;
        }

        public void setMyEntity(MyEntity myEntity) {
            this.myEntity = myEntity;
        }
    }
    public class DbSetting {

        private String name;
        private String password;

        public DbSetting(String name, String password) {
            this.name = name;
            this.password = password;
        }

    }
    public class MyEntity {

        private UUID id;
        private String name;

        public MyEntity(String name) {
            this.name = name;
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return new StringBuilder().append("MyEntity{").append("id=").append(id).append(", name='").append(name).append('\'').append('}').toString();
        }
    }
}
