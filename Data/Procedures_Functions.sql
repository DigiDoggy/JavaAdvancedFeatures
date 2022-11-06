

DELIMITER //

Create procedure GetAllCountriesAndState()
begin
select*from country left join states on country.id = states.countryID 
union
select*from country right join states on country.id = states.countryID;

end
//DELIMITER ;

call GetAllCountriesAndState();

DELIMITER //

create function GredeExplained(grade int)
returns varchar(20)
DETERMINISTIC 
begin
	declare studentGrade varchar(20);
    if grade > 9 then
		set studentGrade = 'Super';
	elseif (grade >= 8 and grade <=9) then 
		set studentGrade = 'Very good';
	elseif grade >5 then
		set studentGrade = 'Good';
	Elseif grade < 5 then 
		set studentGrade = 'not that good';
	 end if;
-- Returning value
	return (studentGrade);
end
//DELIMITER ;

call GredeExplained('5');

SELECT grade, GredeExplained(grade) FROM grades WHERE subjectID = 1 AND studentID = 1;

-- house multiplane rooms  - furniture ( daatabase what kind of furniture we have and what furniture we have in a place

-- tables
-- 1.rooms (7)
	-- ID
	-- Type of room (string)
    -- Size in m2 (float)
    -- Floor (int)
    -- Renovated (Boolean)
    -- Optimal furniture count (int) 
    
-- 2.Furniture(15)
	-- ID
	-- Type of furniture (strin)
    -- Cost (float)
    -- Brand (string)
    -- New (new/used) (Boolean) new -> true and used -> false
    -- Matirial (string) 
    
-- 3. Location Of furniture (references)
	-- RoomID
    -- Furniture ID

--  Queris 

-- 1. Rooms total cost searching by room name (type)
-- 2. Show all furniture info (type,Brand and Cost) in particular room seaching by room name;
-- 3. How many now furniture is in the room searching by room name;
-- 4. Average room size in the house
-- 5. List all renovated rooms where there is atleast 3 furniture units
-- 6. List room where sum of furniture cost is more than 1000, so the robbers know where to go
-- 7. how all unique furniture in the room (there could be multiple units of the same furniture in the room)
-- 8. Most popular material for furniture in the room seaaching by room name
-- 9. List all rooms where there is more than optimal furniture count

-- Dining room, kitchen, bathroom, bedroom, cellar, guest bedroom
 -- living room

Create table Furniture(
	furnitureID int not null AUTO_INCREMENT,
	Typeoffurniture varchar(50),
    Cost float,
    -- Brand (string)
    -- New (new/used) (Boolean) new -> true and used -> false
    -- Matirial (string) 
