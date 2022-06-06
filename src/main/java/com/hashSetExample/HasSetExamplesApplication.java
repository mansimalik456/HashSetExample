package com.hashSetExample;

import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HasSetExamplesApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(HasSetExamplesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HasSetExamplesApplication.class, args);
		
        HashSet<String> hashSet =new HashSet<String>();  
        
        logger.info("Size of Hashset Before adding the element : {}" , hashSet.size());
        
        hashSet.add("One");  
        hashSet.add("Two");  
        hashSet.add("Three");  
        hashSet.add("Four");
        hashSet.add("Five");
        
        logger.info("An initial list of elements : {}", hashSet);  
        
        logger.info("Size of Hashset After adding the element : {}" , hashSet.size());
        
        //Adding Duplicate value in hashSet
        hashSet.add("Three");
        hashSet.add("One");
        logger.info("After adding 'Three' and 'One' as duplicate value  : {}" , hashSet);
             
        //Traversing elements   
        logger.info("Traversing the set using Iterator : ");
        Iterator<String> itr=hashSet.iterator();  
        while(itr.hasNext()){  
        	logger.info(itr.next());  
        }  
    
        HashSet<String> newHashSet =new HashSet<String>();  
        newHashSet.add("Ravi");  
        newHashSet.add("Vijay");  
        newHashSet.add("Ravi");  
        newHashSet.add("Ajay");  
          
        logger.info("An initial list of elements of new Hashset : {}" , newHashSet); 
        

        // Creating a new cloned set
        HashSet clonedSet = new HashSet(); 
        clonedSet = (HashSet) newHashSet.clone();
        logger.info("Clone the new HashSet : {}" , clonedSet);
        
//        logger.info("Traversing the new Hashset using Iterator : ");
//        Iterator<String> it=newHashSet.iterator();  
//        while(it.hasNext()){  
//        logger.info(it.next());  
//        }  
        
        newHashSet.add("Suraj"); 
        logger.info("After invoking add(E e) method: {}" , newHashSet); 
        
        HashSet<String> obj2=new HashSet<String>();  
        obj2.add("Dhruv");  
        obj2.add("Gaurav");  
        newHashSet.addAll(obj2);  
        logger.info("Updated List: {}",  newHashSet);  
        
        newHashSet.remove("Ravi");  
        logger.info("After invoking remove(object) method: {}" , newHashSet);  
        
        newHashSet.removeIf(str->str.contains("Vijay"));    
        logger.info("After invoking removeIf() method: {}" , newHashSet);  
        
        newHashSet.removeAll(obj2);  
        logger.info("After invoking removeAll() method: {}" , newHashSet);     

		
	}

}
