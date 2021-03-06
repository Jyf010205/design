package command;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommond;

    private NoCommand noCommand = new NoCommand();

    //初始化命令组
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0;i < 5;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommond = noCommand;
    }

    //添加命令
    public void setCommands(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //执行命令on
    public void onButtonWasPushed(int no){
        //执行按钮
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommond = onCommands[no];
    }

    //执行命令on
    public void offButtonWasPushed(int no){
        offCommands[no].execute();

        undoCommond = offCommands[no];
    }

    public void onUndoButton(){
        undoCommond.undo();
        undoCommond = noCommand;
    }
}
