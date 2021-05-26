INSERT INTO role(name)
VALUES ('ADMIN');
INSERT INTO role(name)
VALUES ('MANAGER');
INSERT INTO role(name)
VALUES ('USER');

INSERT INTO firm(address, name, password, username)
VALUES ('ADMIN_ADDRESS', 'ADMIN', '$2a$10$9w9ulMBRjQ0fi6jMl47otuZxKLed8/gRAhruon9FChr1v4/SXaI0K', 'admin');

INSERT INTO firm_role(firm_id, role_id)
VALUES (1,1);
INSERT INTO firm_role(firm_id, role_id)
VALUES (1,2);
INSERT INTO firm_role(firm_id, role_id)
VALUES (1,3);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('Sweden', 'Dianophen', 100);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('US', 'Kanutane', 60);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('KZ', 'Alkerall', 45);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('Italy', 'Azadafinil', 55);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('Japan', 'Monosol Palitroban', 25);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('Italy', 'Pancretalol Aldestora', 55);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('Japan', 'Edrotoin Solanazole', 25);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('Sweden', 'Xenagen', 100);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('US', 'Prepabutrol', 60);

INSERT INTO medicine(manufacturer, name, price)
VALUES ('KZ', 'Aspaparin', 45);
