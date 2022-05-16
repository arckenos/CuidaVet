package gutierrez.rafael.cuidavet;
import android.media.AudioRecord;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;


public class DAOUser {
    private DatabaseReference databaseReference;

    public DAOUser(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();

        databaseReference = db.getReference("Users");
    }

    public Task<Void> add(Usuario user){

        return databaseReference.child(user.getUsuario()).setValue(user);
        //return databaseReference.push().setValue(user);
    }

    public Task<Void> update(String key, HashMap<String, Object> hashMap){
        return databaseReference.child(key).updateChildren(hashMap);
    }

    public Task<Void> remove(String key){
        return databaseReference.child(key).removeValue();
    }


    public DatabaseReference get(String key) {
        return databaseReference.child(key);
    }

}
