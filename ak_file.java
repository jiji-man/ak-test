  
file_path = os.path.join(os.path.dirname(__file__), "../../../conf/key.conf")
    cf = configparser.ConfigParser()
    cf.read(file_path)
    section = 'github'
    git_host = 'github.com'
    git_api_host = 'api.github.com'
    user_name = cf.get(section, 'user')
    password = cf.get(section, 'password')
    api_token = cf.get(section, 'token')
    ak = 'LTAI4G3bG7aymzveKCkFxm8g'
    leak_list = git.GithubCrawl(git_host, git_api_host, user_name, password, ak, api_token).login()
    print(leak_list)
