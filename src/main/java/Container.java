public class Container {

    private final ProfiledBean profiledBean;

    public Container(ProfiledBean profiledBean) {
        this.profiledBean = profiledBean;
    }

    @Override
    public String toString() {
        return profiledBean.toString();
    }

}
