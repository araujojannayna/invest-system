CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE income (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    income_date DATE NOT NULL,
    income_value DECIMAL(15,2) NOT NULL
);