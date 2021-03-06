package state.store;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/5 23:05
 */
public class PaidState extends AbstractState{
    @Override
    public void feedBackEvent(Context context) {
        context.setState(new feedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getName();
    }
}
