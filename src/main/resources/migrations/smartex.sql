create table m_role
(
	id bigserial not null
		constraint role_pk
			primary key,
	role_name varchar not null
);

alter table m_role owner to postgres;

create table m_user
(
	id bigserial not null
		constraint user_pk
			primary key,
	name varchar,
	surname varchar,
	email varchar not null,
	role_id bigint not null
		constraint user_role_id_fk
			references m_role,
	login varchar not null,
	password varchar not null
);

alter table m_user owner to postgres;

create unique index user_id_uindex
	on m_user (id);

create unique index role_id_uindex
	on m_role (id);

create table m_area
(
	id bigserial not null
		constraint m_area_pk
			primary key,
	name varchar not null
);

alter table m_area owner to postgres;

create table m_course
(
	id bigserial not null
		constraint course_pk
			primary key,
	course_name varchar not null,
	area_id bigint
		constraint m_course_m_area_id_fk
			references m_area,
	creator_id bigint not null
		constraint m_course_m_user_id_fk
			references m_user,
	price double precision,
	duration_hours bigint
);

alter table m_course owner to postgres;

create unique index course_id_uindex
	on m_course (id);

create table m_user_course
(
	id bigserial not null
		constraint m_user_course_pk
			primary key,
	user_id bigint not null
		constraint m_user_course_user_id_fk
			references m_user,
	course_id bigint not null
		constraint m_user_course_course_id_fk
			references m_course,
	apply_date timestamp not null
);

alter table m_user_course owner to postgres;

create unique index m_user_course_id_uindex
	on m_user_course (id);

create table m_salary
(
	id bigserial not null
		constraint m_salary_pk
			primary key,
	course_id bigint
		constraint m_salary_m_course_id_fk
			references m_course,
	trainer_id bigint
		constraint m_salary_m_user_id_fk
			references m_user,
	hourly_rate double precision,
	work_duration_hours bigint
);

alter table m_salary owner to postgres;

create unique index m_salary_id_uindex
	on m_salary (id);

create table m_lesson
(
	id bigserial not null
		constraint m_lesson_pk
			primary key,
	course_id bigint not null
		constraint m_lesson_m_course_id_fk
			references m_course,
	name varchar not null,
	"order" integer,
	duration bigint
);

alter table m_lesson owner to postgres;

create unique index m_lesson_id_uindex
	on m_lesson (id);

create unique index m_area_id_uindex
	on m_area (id);