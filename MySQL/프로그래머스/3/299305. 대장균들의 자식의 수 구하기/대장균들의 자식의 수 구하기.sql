select p.ID, COUNT(c.PARENT_ID) as CHILD_COUNT
from ECOLI_DATA p
left join ECOLI_DATA c on p.ID = c.PARENT_ID
group by p.ID
order by p.ID;