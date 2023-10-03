package com.example.hosenehotel;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FIreServices {
    private static FIreServices instance;

    private FirebaseAuth auth;
    private FirebaseFirestore store;
    private FirebaseStorage storage;

    private FIreServices ()
    {
        this.auth= FirebaseAuth.getInstance();
        this.store=FirebaseFirestore.getInstance();
        this.storage=FirebaseStorage.getInstance();
    }
    public static FIreServices getInstance()
    {
        if (instance == null)
            instance = new FIreServices();
        return instance;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }

    public FirebaseFirestore getStore() {
        return store;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }
}

