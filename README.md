```mermaid
    erDiagram
    roles{
        long role_id PK
        string role_name
    }
    
    users {
        long user_id PK
        string name
        string surname
        long role_id FK
    }
    
    requests {
        long request_id PK
        localdate request_date
        long topic_id FK
        string description
    }

    topics {
        long topic_id PK
        string topic_name
    }

    supports {
        long support_id PK
        long request_id FK
        long support_user_id FK
        localdate support_date
    }

    users ||--|{ supports : help
    supports ||--|| requests : has 
    requests }|--|| users : ask
    requests }|--|| topics : has
    users }|--|| roles : has

```