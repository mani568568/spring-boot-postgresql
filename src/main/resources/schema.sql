
CREATE TABLE public.employee
(
    employee_id character varying(30) COLLATE pg_catalog."default",
    employee_name character varying(30) COLLATE pg_catalog."default",
    employee_address character varying(30) COLLATE pg_catalog."default",
    employee_email character varying(30) COLLATE pg_catalog."default"
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.employee
    OWNER to postgres;