-- Insert data into 'rol' table
INSERT INTO rol (id, name) VALUES
(1, 'Admin'),
(2, 'User'),
(3, 'Moderator'),
(4, 'Guest'),
(5, 'Editor'),
(6, 'Manager'),
(7, 'Developer'),
(8, 'Analyst'),
(9, 'Tester'),
(10, 'Support');

-- Insert data into 'users' table
INSERT INTO users (id, created_at, email, password, username) VALUES
(1, '2023-01-01 12:00:00', 'admin@example.com', 'adminpass', 'admin_user'),
(2, '2023-01-02 14:30:00', 'user1@example.com', 'userpass1', 'user1'),
(3, '2023-01-03 16:45:00', 'moderator@example.com', 'modpass', 'moderator_user'),
(4, '2023-01-04 18:20:00', 'guest@example.com', 'guestpass', 'guest_user'),
(5, '2023-01-05 10:10:00', 'editor@example.com', 'editorpass', 'editor_user'),
(6, '2023-01-06 08:55:00', 'manager@example.com', 'managerpass', 'manager_user'),
(7, '2023-01-07 22:15:00', 'developer@example.com', 'devpass', 'developer_user'),
(8, '2023-01-08 19:30:00', 'analyst@example.com', 'analystpass', 'analyst_user'),
(9, '2023-01-09 05:40:00', 'tester@example.com', 'testerpass', 'tester_user'),
(10, '2023-01-10 11:50:00', 'support@example.com', 'supportpass', 'support_user');

-- Insert data into 'user_detail' table
INSERT INTO user_detail (id, age, birthday, first_name, last_name, user_id) VALUES
(1, 25, '1998-03-15 00:00:00', 'John', 'Doe', 1),
(2, 30, '1993-05-20 00:00:00', 'Alice', 'Johnson', 2),
(3, 28, '1995-11-10 00:00:00', 'Bob', 'Smith', 3),
(4, 22, '2001-08-05 00:00:00', 'Emily', 'Williams', 4),
(5, 35, '1988-02-28 00:00:00', 'Charlie', 'Brown', 5),
(6, 40, '1983-09-12 00:00:00', 'Eva', 'Miller', 6),
(7, 27, '1996-07-08 00:00:00', 'David', 'Jones', 7),
(8, 32, '1991-04-25 00:00:00', 'Grace', 'Davis', 8),
(9, 26, '1997-12-18 00:00:00', 'Frank', 'Taylor', 9),
(10, 33, '1990-06-30 00:00:00', 'Helen', 'White', 10);

-- Insert data into 'user_rol' table
INSERT INTO user_rol (id, active, created_at, rol_id, user_id) VALUES
(1, true, '2023-01-01 12:05:00', 1, 1),
(2, true, '2023-01-02 14:35:00', 2, 2),
(3, true, '2023-01-03 16:50:00', 3, 3),
(4, false, '2023-01-04 18:25:00', 4, 4),
(5, true, '2023-01-05 10:15:00', 5, 5),
(6, true, '2023-01-06 09:00:00', 6, 6),
(7, true, '2023-01-07 22:20:00', 7, 7),
(8, false, '2023-01-08 19:35:00', 8, 8),
(9, true, '2023-01-09 05:45:00', 9, 9),
(10, true, '2023-01-10 11:55:00', 10, 10);
