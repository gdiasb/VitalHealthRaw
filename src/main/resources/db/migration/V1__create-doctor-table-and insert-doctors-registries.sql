create table DOCTOR_TABLE (
                              id BIGINT NOT NULL auto_increment,
                              username VARCHAR(50) NOT NULL,
                              active BIT NOT NULL,
                              full_name VARCHAR(50),
                              email VARCHAR(50),
                              gender VARCHAR(50),
                              doctor_speciality VARCHAR(11),
                              doctor_license INT,
                              street_suffix VARCHAR(50),
                              street_name VARCHAR(50),
                              street_number VARCHAR(50),
                              postal_code VARCHAR(50),
                              state VARCHAR(50),

                              primary key (id)
);
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('vmeece0', 0, 'Valli Meece', 'vmeece0@nih.gov', 'Agender', 'NEUROLOGY', 649607, 'Alley', 'Ludington', '9', '46857', 'IN');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('nfuentes1', 0, 'Nevins Fuentes', 'nfuentes1@bbb.org', 'Male', 'GINECOLOGY', 570736, 'Parkway', 'Kinsman', '510', '48555', 'MI');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('jmcerlaine2', 0, 'Judie McErlaine', 'jmcerlaine2@narod.ru', 'Female', 'CARDIOLOGY', 373584, 'Place', 'Straubel', '74788', '39404', 'MS');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('dbeek3', 0, 'Darcy Beek', 'dbeek3@weibo.com', 'Male', 'CARDIOLOGY', 256051, 'Circle', 'Stephen', '85013', '48555', 'MI');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('pbewley4', 1, 'Pavel Bewley', 'pbewley4@ted.com', 'Male', 'PEDIATRICS', 453765, 'Park', 'Lyons', '56381', '44315', 'OH');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('dferroli5', 0, 'Devondra Ferroli', 'dferroli5@ca.gov', 'Female', 'CARDIOLOGY', 926472, 'Point', 'Sycamore', '17', '43204', 'OH');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('bgallier6', 0, 'Brenn Gallier', 'bgallier6@examiner.com', 'Bigender', 'PEDIATRICS', 468131, 'Park', 'Jana', '07', '60604', 'IL');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('obrogden7', 1, 'Olag Brogden', 'obrogden7@digg.com', 'Male', 'PEDIATRICS', 103570, 'Point', 'Swallow', '2434', '66611', 'KS');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('lmcinnes8', 1, 'Lorin McInnes', 'lmcinnes8@canalblog.com', 'Male', 'CARDIOLOGY', 612003, 'Place', 'Waxwing', '34197', '20551', 'DC');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('tpulster9', 1, 'Tobiah Pulster', 'tpulster9@gizmodo.com', 'Genderqueer', 'PEDIATRICS', 423840, 'Center', 'Homewood', '06232', '23225', 'VA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('jspringalla', 0, 'Janetta Springall', 'jspringalla@mapquest.com', 'Female', 'CARDIOLOGY', 868054, 'Avenue', 'Michigan', '7', '70883', 'LA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('xpalluschekb', 0, 'Ximenes Palluschek', 'xpalluschekb@com.com', 'Male', 'NEUROLOGY', 790122, 'Avenue', 'Raven', '8629', '75379', 'TX');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('alawrensonc', 1, 'Ariella Lawrenson', 'alawrensonc@freewebs.com', 'Non-binary', 'PEDIATRICS', 155920, 'Park', 'Dexter', '73201', '80255', 'CO');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('sgulleyd', 0, 'Saleem Gulley', 'sgulleyd@unblog.fr', 'Male', 'NEUROLOGY', 280882, 'Trail', 'Ohio', '68', '86305', 'AZ');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('rcardenase', 1, 'Roselle Cardenas', 'rcardenase@ocn.ne.jp', 'Female', 'DERMATOLOGY', 722158, 'Way', 'Armistice', '97073', '79928', 'TX');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('ttosneyf', 1, 'Teresita Tosney', 'ttosneyf@bizjournals.com', 'Female', 'NEUROLOGY', 626126, 'Crossing', 'Green', '5011', '75236', 'TX');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('mlarhamg', 0, 'Marnie Larham', 'mlarhamg@nih.gov', 'Female', 'GINECOLOGY', 887777, 'Avenue', 'Pepper Wood', '808', '78789', 'TX');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('ddeverilleh', 1, 'Dell Deverille', 'ddeverilleh@nasa.gov', 'Female', 'CARDIOLOGY', 124162, 'Alley', 'Crownhardt', '0', '20591', 'DC');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('amathyi', 0, 'Amargo Mathy', 'amathyi@sina.com.cn', 'Female', 'DERMATOLOGY', 869517, 'Circle', 'Dennis', '86865', '06538', 'CT');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('sswanborrowj', 0, 'Samara Swanborrow', 'sswanborrowj@mapquest.com', 'Female', 'NEUROLOGY', 473584, 'Alley', 'Truax', '56379', '77035', 'TX');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('gferrandezk', 1, 'Gav Ferrandez', 'gferrandezk@dailymail.co.uk', 'Male', 'NEUROLOGY', 121485, 'Parkway', 'Forest Run', '299', '77020', 'TX');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('sciraldol', 0, 'Suzann Ciraldo', 'sciraldol@mysql.com', 'Female', 'NEUROLOGY', 477373, 'Alley', 'Granby', '175', '36109', 'AL');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('sjervoism', 0, 'Shelton Jervois', 'sjervoism@house.gov', 'Male', 'NEUROLOGY', 936490, 'Parkway', 'Burrows', '3442', '92645', 'CA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('pbrissetn', 1, 'Park Brisset', 'pbrissetn@creativecommons.org', 'Male', 'CARDIOLOGY', 433276, 'Street', 'Twin Pines', '58', '67260', 'KS');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('dcantuo', 0, 'Douglas Cantu', 'dcantuo@cnbc.com', 'Male', 'PEDIATRICS', 17430, 'Crossing', 'Talisman', '07584', '30919', 'GA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('jbosworthp', 1, 'Jedediah Bosworth', 'jbosworthp@google.de', 'Agender', 'PEDIATRICS', 185598, 'Alley', 'Fisk', '46', '85035', 'AZ');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('obeekmanq', 1, 'Ogden Beekman', 'obeekmanq@plala.or.jp', 'Male', 'DERMATOLOGY', 733284, 'Street', 'Vahlen', '501', '27717', 'NC');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('holdingr', 0, 'Hastie Olding', 'holdingr@utexas.edu', 'Male', 'GINECOLOGY', 604122, 'Center', 'Randy', '8038', '32825', 'FL');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('mdarmodys', 0, 'Milzie Darmody', 'mdarmodys@nature.com', 'Female', 'NEUROLOGY', 220169, 'Circle', 'Jenifer', '1', '71137', 'LA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('mhovellt', 1, 'Mandi Hovell', 'mhovellt@xing.com', 'Female', 'GINECOLOGY', 903174, 'Crossing', 'Merry', '91514', '02745', 'MA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('jrisdallu', 1, 'Jasen Risdall', 'jrisdallu@fema.gov', 'Male', 'GINECOLOGY', 787991, 'Court', 'West', '4726', '46825', 'IN');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('rstokesv', 1, 'Ruthann Stokes', 'rstokesv@netvibes.com', 'Female', 'CARDIOLOGY', 204709, 'Court', 'Londonderry', '528', '30092', 'GA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('gcabottow', 1, 'Ginger Cabotto', 'gcabottow@samsung.com', 'Male', 'CARDIOLOGY', 512704, 'Alley', 'Messerschmidt', '4', '48217', 'MI');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('mjenourex', 0, 'Marcile Jenoure', 'mjenourex@twitpic.com', 'Female', 'NEUROLOGY', 937933, 'Hill', 'Oneill', '3', '33758', 'FL');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('gcolumbiney', 0, 'Gregg Columbine', 'gcolumbiney@phoca.cz', 'Polygender', 'DERMATOLOGY', 736810, 'Place', 'Leroy', '1', '59112', 'MT');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('mhaggerz', 1, 'Meredith Hagger', 'mhaggerz@ocn.ne.jp', 'Female', 'PEDIATRICS', 569405, 'Plaza', 'Goodland', '38980', '02163', 'MA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('scolmore10', 1, 'Stacy Colmore', 'scolmore10@google.com.hk', 'Female', 'PEDIATRICS', 544348, 'Circle', 'Calypso', '73', '48107', 'MI');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('dlakes11', 0, 'Dawn Lakes', 'dlakes11@drupal.org', 'Female', 'CARDIOLOGY', 467604, 'Way', 'Hayes', '036', '77005', 'TX');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('eshipsey12', 0, 'Ellwood Shipsey', 'eshipsey12@reverbnation.com', 'Male', 'CARDIOLOGY', 763538, 'Pass', 'Scoville', '03097', '95818', 'CA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('ycapstick13', 1, 'Yalonda Capstick', 'ycapstick13@ow.ly', 'Female', 'DERMATOLOGY', 60435, 'Place', '7th', '215', '46216', 'IN');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('bnajara14', 1, 'Brodie Najara', 'bnajara14@oaic.gov.au', 'Male', 'DERMATOLOGY', 394362, 'Center', 'Northridge', '626', '87140', 'NM');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('llenney15', 0, 'Lynda Lenney', 'llenney15@nytimes.com', 'Female', 'PEDIATRICS', 80074, 'Hill', 'Swallow', '18279', '46852', 'IN');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('ounsworth16', 0, 'Olga Unsworth', 'ounsworth16@liveinternet.ru', 'Female', 'NEUROLOGY', 387681, 'Street', 'Boyd', '3055', '33906', 'FL');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('dolennikov17', 0, 'Dall Olennikov', 'dolennikov17@github.io', 'Male', 'GINECOLOGY', 888035, 'Center', 'Lighthouse Bay', '37', '60691', 'IL');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('zcallendar18', 0, 'Zechariah Callendar', 'zcallendar18@list-manage.com', 'Genderqueer', 'DERMATOLOGY', 811150, 'Center', 'Independence', '43', '22156', 'VA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('bdrabble19', 1, 'Bidget Drabble', 'bdrabble19@ycombinator.com', 'Agender', 'GINECOLOGY', 933755, 'Alley', 'Vidon', '2', '34238', 'FL');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('gabel1a', 0, 'Gloria Abel', 'gabel1a@usda.gov', 'Female', 'NEUROLOGY', 371178, 'Junction', 'Thackeray', '3273', '48206', 'MI');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('cskakunas1b', 0, 'Carmelia Skakunas', 'cskakunas1b@behance.net', 'Female', 'DERMATOLOGY', 481821, 'Crossing', 'Glendale', '4', '70593', 'LA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('cgerling1c', 0, 'Courtnay Gerling', 'cgerling1c@marketwatch.com', 'Female', 'PEDIATRICS', 384215, 'Road', 'Truax', '9', '23514', 'VA');
insert into DOCTOR_TABLE (username, active, full_name, email, gender, doctor_speciality, doctor_license, street_suffix, street_name, street_number, postal_code, state) values ('dcalway1d', 1, 'Davis Calway', 'dcalway1d@ihg.com', 'Male', 'PEDIATRICS', 360622, 'Way', 'Del Sol', '263', '73167', 'OK');