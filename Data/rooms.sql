-- TABLES
-- 1. Rooms (7)
	-- ID
    -- Type of room (string)
    -- Size in m2 (float)
    -- Floor (int)
    -- Renovated (boolean)
    -- Optimal furniture count (int)
-- 2. Furniture(15)
	-- ID
	-- Type of furniture (string)
    -- Cost (float)
    -- Brand (string)
    -- New (new/used) (Boolean) new -> true and used -> false
    -- Material (string)
-- 3. Location Of Furniture (REFERENCES)
	-- RoomID
    -- Furniture ID
-- Queries
-- 1. Rooms total cost searching by room name (type)
-- 2. Show all furniture info (Type,Brand and Cost) in particular room searching by room name;
-- 3. How many new furniture is in the room searching by room name;
-- 4. Average room size in the house
-- 5. List all renovated rooms where there is atleast 3 furniture units
-- 6. List room where sum of furniture cost is more that 1000, so the robbers know where to go
-- 7. Show all unique furniture in the room (there could be multiple units of the same furniture in the room)
-- 8. Most popular material for furniture in room seaching by room name
-- 9. List all rooms where there is more than optimal furniture count


DROP TABLE furniturelocation;
DROP TABLE rooms;
DROP TABLE furniture;




create table rooms (
RoomID int not null auto_increment,
roomType varchar(50) not null,
Size float not null,
Floor int not null,
Renovated boolean not null,
optFurnitureCount int not null,
Primary key (RoomID)
);




Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('dining room', 10.2, 1, true, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('kitchen', 15.8, 1, false, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('bathroom', 8.9, 2, true, 8);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('bedroom', 20, 2, true, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('cellar', 6.5, 2, false, 6);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('guest bedroom', 11.3, 1, true, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('living room', 32.1, 1, false, 15);

select * from rooms;


CREATE TABLE furniture (
    furnitureID INT NOT NULL auto_increment,
    furnitureType VARCHAR(50) NOT NULL,
    cost FLOAT NOT NULL,
    brand VARCHAR(50) NOT NULL,
    new BOOLEAN NOT NULL,
    material VARCHAR(20) ,
    PRIMARY KEY (FurnitureID)
);

-- DINING ROOM furniture : chair 4, dining table, arm chair, sofa, sideboard, vase, chandelier.
-- Kitchen furniture: microwave, fridge, knife block, cooker hood, kettle, shelf, stove, worktop, sink, cupboard.
-- Bathroom furniture: mirror, trash can, bathtub, faucet, bath mat, shower , toilet.
-- Bedroom furniture:  bed, bedside table, dressing table, painting, wardrobe, nightstand.
-- Cellar furniture: shelves, cupboard, holders.
-- Guest bedroom furniture: -//- bedroom 
-- Living room furniture: tv stand, chair, TV, rug, bookshelf, floor lamp.

-- Material :glass/steel/fabric/wood/leather/plastic/ceramic
-- Brand: Ikea, Kave Home, Lindeberg, Tarmeko, Wermo, Artex Design, OOT-OOT, Electroluxб false




Insert into furniture (furnitureType, cost, brand, new, material) VALUES ('bed', 300, 'IKEA', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) VALUES ('bath', 500, 'Bath and Co', false, 'ceramic');
Insert into furniture (furnitureType, cost, brand, new, material) VALUES ('sofa', 200, 'Jysk', false, 'leather');
Insert into furniture (furnitureType, cost, brand, new, material) VALUES ('chair', 50, 'IKEA', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('sofa', 800, 'Ikea', true, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values ('chair', 300, 'Kave Home', false, 'leather');
Insert into furniture(furnitureType, cost, brand, new, material) values ('dining table', 650, 'Lindeberg', false, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('arm chair', 700, 'Tarmeko', false, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values ('sideboard', 2000, 'OOT-OOT', false, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values ('vase', 50, 'Ikea', true, 'glass');
Insert into furniture(furnitureType, cost, brand, new, material) values ('chandelier', 300, 'Artex Design', true, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('microwave', 350, 'Electrolux', true, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('fridge', 799, 'Electrolux', true, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('knife block', 25, 'Artex Design', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('cooker hood', 300, 'Electrolux', false, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('kettle', 149, 'Electrolux', true, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('shelf', 500, 'Ikea', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('stove', 699, 'Electrolux', true, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('worktop', 250, 'Ikea', false, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('sink', 349, 'OOT-OOT', true, 'ceramic');
Insert into furniture(furnitureType, cost, brand, new, material) values ('cupboard', 800, 'Artex Design', true, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values ('mirror', 19, 'Lindeberg', true, 'glass');
Insert into furniture(furnitureType, cost, brand, new, material) values ('trash can', 19, 'Wermo', true, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('bathtub', 19, 'Kave Home', true, 'plastic');
Insert into furniture(furnitureType, cost, brand, new, material) values ('faucet', 19, 'Lindeberg', true, 'steel');
Insert into furniture(furnitureType, cost, brand, new, material) values ('bath mat', 19, 'Wermo', true, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values ('shower', 19, 'Lindeberg', true, 'plastic');
Insert into furniture(furnitureType, cost, brand, new, material) values ('toilet', 19, 'Wermo', true, 'ceramic');
Insert into furniture(furnitureType, cost, brand, new, material) values (1,'bed', 19, 'Lindeberg', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values (2,'bedside table', 99, 'Wermo', false, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values (3,'painting', 30, 'Tarmeko', true, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values (4,'wardrobe', 3000, 'Lindeberg', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values (5,'nightstand', 99, 'Artex Design', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values (6,'shelves', 150, 'Artex Design', false, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('tv stand', 200, 'Artex Design', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('chair', 500, 'Kave Home', false, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values ('TV', 499, 'Lindeberg', true, 'plastic');
Insert into furniture(furnitureType, cost, brand, new, material) values ('rug', 40, 'Kave Home', false, 'fabric');
Insert into furniture(furnitureType, cost, brand, new, material) values ('bookshelf', 449, 'Lindeberg', true, 'wood');
Insert into furniture(furnitureType, cost, brand, new, material) values ('floor lamp', 49, 'Artex Design', false, 'steel');




select*from furniture;


/* 3. Location of Furniture (REFERENCES)
RoomID
FurnitureID
*/
CREATE TABLE furnitureLocation(
RoID int NOT NULL,
FuID int NOT NULL,
PRIMARY KEY (RoID, FuID),
FOREIGN KEY (RoID) REFERENCES rooms(RoomID),
FOREIGN KEY (FuID) REFERENCES furniture(FurnitureID)

);
DROP TABLE furniturelocation;


Insert into furniturelocation(RoID, FuID) values (1,7);
Insert into furniturelocation(RoID, FuID) values (1,6);
Insert into furniturelocation(RoID, FuID) values (1,4);
Insert into furniturelocation(RoID, FuID) values (1,10);
Insert into furniturelocation(RoID, FuID) values (1,11);
Insert into furniturelocation(RoID, FuID) values (2,11);
Insert into furniturelocation(RoID, FuID) values (2,9);
Insert into furniturelocation(RoID, FuID) values (2,10);
Insert into furniturelocation(RoID, FuID) values (2,12);
Insert into furniturelocation(RoID, FuID) values (2,13);
Insert into furniturelocation(RoID, FuID) values (2,14);
Insert into furniturelocation(RoID, FuID) values (2,15);
Insert into furniturelocation(RoID, FuID) values (2,16);
Insert into furniturelocation(RoID, FuID) values (2,18);
Insert into furniturelocation(RoID, FuID) values (2,19);
Insert into furniturelocation(RoID, FuID) values (2,20);
Insert into furniturelocation(RoID, FuID) values (2,21);
Insert into furniturelocation(RoID, FuID) values (2,23);
Insert into furniturelocation(RoID, FuID) values (2,25);
Insert into furniturelocation(RoID, FuID) values (2,16);
Insert into furniturelocation(RoID, FuID) values (3,20);
Insert into furniturelocation(RoID, FuID) values (3,21);
Insert into furniturelocation(RoID, FuID) values (3,22);
Insert into furniturelocation(RoID, FuID) values (3,23);
Insert into furniturelocation(RoID, FuID) values (3,24);
Insert into furniturelocation(RoID, FuID) values (3,25);
Insert into furniturelocation(RoID, FuID) values (3,26);
Insert into furniturelocation(RoID, FuID) values (3,27);
Insert into furniturelocation(RoID, FuID) values (3,28);
Insert into furniturelocation(RoID, FuID) values (3,2);
Insert into furniturelocation(RoID, FuID) values (4,1);
Insert into furniturelocation(RoID, FuID) values (4,28);
Insert into furniturelocation(RoID, FuID) values (4,8);
Insert into furniturelocation(RoID, FuID) values (4,10);
Insert into furniturelocation(RoID, FuID) values (4,22);
Insert into furniturelocation(RoID, FuID) values (4,33);
Insert into furniturelocation(RoID, FuID) values (4,34);
Insert into furniturelocation(RoID, FuID) values (4,11);
Insert into furniturelocation(RoID, FuID) values (5,33);
Insert into furniturelocation(RoID, FuID) values (5,22);
Insert into furniturelocation(RoID, FuID) values (5,17);
Insert into furniturelocation(RoID, FuID) values (6,1);
Insert into furniturelocation(RoID, FuID) values (6,3);
Insert into furniturelocation(RoID, FuID) values (6,4);
Insert into furniturelocation(RoID, FuID) values (6,10);
Insert into furniturelocation(RoID, FuID) values (6,11);
Insert into furniturelocation(RoID, FuID) values (6,17);
Insert into furniturelocation(RoID, FuID) values (6,22);
Insert into furniturelocation(RoID, FuID) values (6,29);
Insert into furniturelocation(RoID, FuID) values (6,31);
Insert into furniturelocation(RoID, FuID) values (6,32);
Insert into furniturelocation(RoID, FuID) values (6,33);
Insert into furniturelocation(RoID, FuID) values (6,34);
Insert into furniturelocation(RoID, FuID) values (7,3);
Insert into furniturelocation(RoID, FuID) values (7,6);
Insert into furniturelocation(RoID, FuID) values (7,8);
Insert into furniturelocation(RoID, FuID) values (7,10);
Insert into furniturelocation(RoID, FuID) values (7,11);
Insert into furniturelocation(RoID, FuID) values (7,30);
Insert into furniturelocation(RoID, FuID) values (7,29);
Insert into furniturelocation(RoID, FuID) values (7,31);
Insert into furniturelocation(RoID, FuID) values (7,33);
Insert into furniturelocation(RoID, FuID) values (7,34);










select * from rooms;

select * from furniture;

select* from furniturelocation;



-- 3. How many new furniture is in the room searching by room name;


-- 6. List room where sum of furniture cost is more that 1000, so the robbers know where to go




-- 1. Rooms total cost searching by room name (type)
select sum(cost) from furniture
 where furnitureID in(select FuID from furnitureLocation
 where RoID in(select RoomID from rooms where roomType='bedroom'));

-- 2. Show all furniture info (Type,Brand and Cost) in particular room searching by room name;
select furnitureType, brand, cost, material new from furniture where furnitureID in(select  FuID from furnitureLocation where RoID in(select RoomID from rooms where roomType='bedroom'));

-- 3. How many new furniture is in the room searching by room name;
select  sum(new) from furniture where furnitureID in(select  FuID from furnitureLocation where RoID in(select RoomID from rooms where roomType='bedroom'));

-- 4. Average room size in the house
select round(avg(size),2) from rooms where RoomID in (select RoID from furniturelocation);

-- 5. List all renovated rooms where there is atleast 3 furniture units

 SELECT rooms.RoomType, COUNT(furniturelocation.RoID), rooms.Renovated
FROM rooms, furniturelocation
WHERE furniturelocation.RoID = rooms.RoomID
GROUP BY furniturelocation.RoID
HAVING COUNT(furniturelocation.FuID)>2 AND rooms.Renovated = true;

 
 -- 6. List room where sum of furniture cost is more that 1000, so the robbers know where to go

SELECT rooms.RoomType, SUM(furniture.Cost)
FROM rooms, furniturelocation, furniture
WHERE furniturelocation.RoID = rooms.RoomID AND furniture.furnitureID = furnitureLocation.FuID
GROUP BY furniturelocation.RoID
HAVING SUM(furniture.Cost)>1000;

 
 -- 7. Show all unique furniture in the room (there could be multiple units of the same furniture in the room)
 
 SELECT DISTINCT furnitureType FROM furniture WHERE FurnitureID IN(SELECT FuID FROM furnitureLocation WHERE RoID IN(SELECT RoomID FROM rooms WHERE RoomType = 'dining room'));

 
-- 8. Most popular material for furniture in room seaching by room name


    select max(material)  from furniture where furnitureID in( select FuID from furniturelocation where RoID in( select roomID from rooms where roomType = 'bathroom')) ;


 -- 9. List all rooms where there is more than optimal furniture count
  
  SELECT rooms.RoomType, COUNT(furniturelocation.RoID), rooms.optFurnitureCount, furniturelocation.RoID
FROM rooms, furniturelocation
WHERE furniturelocation.RoID = rooms.RoomID
GROUP BY furniturelocation.RoID
HAVING COUNT(furniturelocation.FuID)>rooms.optFurnitureCount;


SELECT * FROM furniture WHERE furnitureID IN(SELECT FuID FROM furniturelocation WHERE RoID IN(SELECT RoomID FROM rooms WHERE RoomType = 'dining room'));

SELECT AVG(Size) FROM rooms;


select roomType from rooms,furniturelocation where rooms.roomID=furniturelocation.RoID group by furniturelocation.RoID having count(furnitureLocation.FuID)< rooms.optFurnitureCount;







