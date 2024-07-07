CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE investiment (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    type VARCHAR(100) NOT NULL,
    name VARCHAR (300) NOT NULL,
    invested_value DECIMAL(15,2) NOT NULL,
    income_id UUID,
    FOREIGN KEY (income_id) REFERENCES income(id) ON DELETE CASCADE;
);