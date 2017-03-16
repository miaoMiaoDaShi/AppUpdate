# AppUpdate
##介绍:一个APP更新库
###功能简介

        版本检查

        从后台的指定连接下载最新的安装包

        软件安装(首先检查文件是否完整)

        根据服务器返回的数据判断是否强制更新（强制更新时，取消更新会延时退出退出）
###示例

     AppUpdater appUpdater1 = new AppUpdater
			//参数1:Context,2:后台的json地址
                        .Builder(this,"http://xxpbox.cn/app/yangyan/appUpdate")
			//对话框是否显示
                        .setShowToDialog(false)
			//是否在状态栏显示
                        .setShowToStatusBar(true)
                        .build();
                CheckUpdater.getInstance().init(appUpdater1);

###参数配置

	//上下文参数
    private final Context context;
    //状态栏显示
    private final boolean showToStatusBar;
    //对话框显示(默认为该放式显示)
    private final boolean showToDialog;
    //更新后自动删除安装包
    private final boolean autoDel;
    //下载方式采用系统的DownloadManager
    private final boolean userDownloadManager;
    //是否使用库默认更新提示对话框
    private final boolean defaultDialog;
    //存储的地址
    private final String filePath;
    //文件的名字
    private final String appName;
    //地址
    private final String url;


###后台json格式

    {
	"versionCode":版本号,整形,
	"versionName":"版本名",
	"describe":"版本描述",
	"constraint":布尔值,
	"url":"最新的app的安装包的下载地址"
	}



	

