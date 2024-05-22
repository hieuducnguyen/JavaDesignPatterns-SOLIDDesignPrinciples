package org.hieunguyen.singleresponsiblity;

public class UserPersistenceService implements IUserPersistence {

    //Store used by controller
    private final Store store = new Store();

    @Override
    public boolean store(User user) {
        store.store(user);
        return false;
    }
}
