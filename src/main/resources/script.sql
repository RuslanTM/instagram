--DROP TABLE publication;
--DROP TABLE person;

CREATE TABLE person
(
  person_id SERIAL NOT NULL,
  person_name character varying(100) NOT NULL,
  person_login character varying(20) NOT NULL,
  sex character varying(1) NOT NULL,
  registered_date date NOT NULL,
  additional_info character varying(200),
  person_birthday date,
  phone_num character varying(30),
  CONSTRAINT person_pkey PRIMARY KEY (person_id)
)



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


