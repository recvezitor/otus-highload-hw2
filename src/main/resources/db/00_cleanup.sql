set search_path to otus_highload;
-- DELETE FROM otus_highload.person WHERE 1=1;
DELETE FROM otus_highload.person WHERE first_name LIKE 'runner%';