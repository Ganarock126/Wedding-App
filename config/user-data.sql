SELECT 'CREATE DATABASE weddingappusers' WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'weddingappusers')\gexec