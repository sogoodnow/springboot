drop table if exists users;
CREATE TABLE `test`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `login_name` VARCHAR(45) NULL COMMENT '',
  `login_pswd` VARCHAR(45) NULL COMMENT '',
  `last_login_time` DATETIME NULL DEFAULT now() COMMENT '',
  `last_ip` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`idusers`)  COMMENT '',
  UNIQUE INDEX `idusers_UNIQUE` (`idusers` ASC)  COMMENT '');
