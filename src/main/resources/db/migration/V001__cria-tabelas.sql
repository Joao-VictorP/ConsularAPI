create table consultorio (
	codConsultorio bigint not null auto_increment,
	nomeConsultorio varchar(60) not null,
	cep int not null,

	primary key (codConsultorio)
);

create table sala (
	numSala bigint not null,
	codConsultorio bigint not null,
	descricaoSala varchar(150),

	primary key (numSala)
);

alter table sala add constraint fk_consultorio_codConsultorio
foreign key (codConsultorio) references consultorio(codConsultorio);

create table medico (
	crm varchar(20) not null,
	nome varchar(80) not null,
	dataNascimento datetime not null,
	cep int not null,
	telefone varchar(15) not null,
	email varchar(50),

	primary key (crm)
);

create table paciente (
	cpf bigint not null,
	nome varchar(80) not null,
	dataNascimento datetime not null,
	peso decimal(3,2) not null,
	altura decimal (1,2) not null,
	cep int not null,
	telefone varchar(15) not null,
	email varchar(50),

	primary key (cpf)
);

create table historicoConsulta (
	id bigint not null auto_increment,
	doenca varchar(20) not null,
	tratamento varchar(100) not null

	primary key (id)
);

create table pagamento (
	id bigint not null auto_increment,
	tipoPagamento varchar(15) not null,
	dataPagamento datetime not null,
	valorPagamento decimal(6,2) not null,

	primary key (id)
);

create table consulta (
	id bigint not null auto_increment,
	dataConsulta datetime not null,
	numSala bigint not null,
	codConsultorio bigint not null,
	crmMedico varchar(20) not null,
	cpfPaciente bigint not null,
	status varchar(15) not null,
	historicoConsulta bigint not null,
	valorConsulta decimal (6,2) not null,

	primary key (id)
);

alter table consulta add constraint fk_sala_numSala
foreign key (numSala) references sala(numSala);

alter table consulta add constraint fk_consultorio_codConsultorio
foreign key (codConsultorio) references consultorio(codConsultorio);

alter table consulta add constraint fk_crm_medico
foreign key (crmMedico) references medico(crm);

alter table consulta add constraint fk_cpf_paciente
foreign key (cpfPaciente) references paciente(cpf);

alter table consulta add constraint kf_historico_consulta
foreign key (historicoConsulta) references historcioConsulta(id);
