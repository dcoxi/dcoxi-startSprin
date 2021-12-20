CREATE TABLE [dbo].[tb_pessoa](
	[id] [bigint] IDENTITY(1,1) NOT NULL primary  key,
	[endereco] [varchar](100) NOT NULL,
	[genero] [varchar](12) NOT NULL,
	[nome] [varchar](120) NOT NULL,
	[sobre_nome] [varchar](80) NOT NULL,
)

