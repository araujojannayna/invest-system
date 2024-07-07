CREATE TABLE contribution (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    contribution_date DATE NOT NULL,
    contribution_value DECIMAL(15,2) NOT NULL
);