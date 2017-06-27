Create TABLE Person (
  person_id       INT          NOT NULL PRIMARY KEY,
  person_name     VARCHAR(100) NOT NULL,
  person_login    VARCHAR(20)  NOT NULL,
  SEX             VARCHAR(1)   NOT NULL,
  REGISTERED_DATE DATE         NOT NULL,
  ADDITIONAL_INFO VARCHAR(200),
  PERSON_BIRTHDAY DATE,
  PHONE_NUM       VARCHAR(30)
);



Create TABLE Publication(
  PUBLICATION_ID BIGINT PRIMARY KEY,
  CREATED_DATE date NOT NULL,
  LIKES_COUNT BIGINT NOT NULL DEFAULT 0,
  UPDATED_DATE DATE,
  PATH_TO_FILE VARCHAR(200),
  PERSON_ID int NOT NULL,
  CONSTRAINT fk_person_publications FOREIGN KEY (PERSON_ID)
  REFERENCES public.person(person_id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION
);

insert into Person(person_id,person_name,person_login,SEX,REGISTERED_DATE)
VALUES(1, 'Ruslan', 'Ruslan','M', current_date);
insert into Person(person_id,person_name,person_login,SEX,REGISTERED_DATE)
VALUES(2, 'Ivan', 'ivan','M', current_date);
insert into Person(person_id,person_name,person_login,SEX,REGISTERED_DATE)
VALUES(3, 'Petr', 'petr','M', current_date);

COMMIT;


