# 用户角色与权限

## 角色说明

Databasir 将用户分为了 4 种角色，它们分别是

- 系统管理员
- 组长
- 组员
- 游客

每个角色的说明以及可配置数量见下面表格

| 角色       | 说明                                             | 数量               |
| ---------- | ------------------------------------------------ | ------------------ |
| 系统管理员 | 拥有平台所有权限                                 | 任意               |
| 组长       | 拥有对应分组下所有读写权限                       | 一个分组最多 20 个 |
| 组员       | 拥有对应分组下部分写权限，所有读权限             | 任意               |
| 游客       | 登入用户的默认角色，能够看见所有分组以及项目文档 | 任意               |

## 默认权限

由于创建分组、数据库扩展等功能只有系统管理员才有，建议为平台设置多位系统管理员。

- 分组模块各角色权限详情

| 功能       | 组员 | 组长 | 游客 | 系统管理员 |
|----------| ---- | ---- | ---- | ---------- |
| **分组模块** | 部分 | 全部 | 只读 | 全部       |
| 查看分组     | √    | √    | √    | √          |
| 编辑分组     | x    | √    | x    | √          |
| 删除分组     | x    | √    | x    | √          |
| 查看组员     | √    | √    | √    | √          |
| 添加组员     | x    | √    | x    | √          |
| 删除组员     | x    | √    | x    | √          |

- 项目模块各角色权限详情

| 功能       | 组员 | 组长 | 游客 | 系统管理员 |
|----------| ---- | ---- | ---- | ---------- |
| **项目模块** | 部分 | 全部 | 只读 | 全部       |
| 查看项目     | √    | √    | √    | √          |
| 创建项目     | √    | √    | x    | √          |
| 删除项目     | √    | √    | x    | √          |
| 编辑项目     | √    | √    | x    | √          |
| 查看讨论     | √    | √    | √    | √          |
| 新增讨论     | √    | √    | x    | √          |
| 删除讨论     | x    | √    | x    | √          |
| 编辑描述     | √    | √    | x    | √          |

- 其余模块只有系统管理员才有

| 功能       | 组员 | 组长 | 游客 | 系统管理员 |
|----------| ---- | ---- | ---- | ---------- |
| **用户模块** | x    | x    | x    | √          |
| **数据库管理** | x    | x    | x    | √          |
| **系统邮箱管理** | x    | x    | x    | √          |
| **登录设置** | x    | x    | x    | √          |
| **系统日志** | x    | x    | x    | √          |





