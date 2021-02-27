import java.util.Iterator;

public class ConcurrentMemoryStoreImpl implements ConcurrentMemoryStore{

	//@Autowired
	//repository
	
	@Override
	public void store(String key, Item item) throws IllegalArgumentException {
		if(!repository.getAll().contains(key)) {
			repository.save(item);
		}else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void update(String key, int value1, int value2) {
		try {
			Item i = repository.getByKey(key);
			
			i.setValue1(value1);
			i.setValue2(value2);
			
			repository.update(i);
			
		}catch (Exception e) {
			Logger.log(ERROR, "Error al updatear el item "+key+" \nError "+e);
		}
	}

	@Override
	public Iterator<Item> valueIterator() {
		return repository.getAll();
	}

	@Override
	public void remove(String key) {
		
		
		try {
			Item i = repository.getByKey(key);
			
			if(i != null) {
				repository.delete(key);
			}
		}catch (Exceptio e) {
			Logger.log(ERROR, "Error al eliminar el item con key: "+key+" \nError "+e);
		}
		
	}

}
