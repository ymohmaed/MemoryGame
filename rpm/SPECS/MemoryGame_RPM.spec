Name: Memory_Game
Version: 1.0
Release: 1%{?dist}
Summary: Memory game for linux.
Group: Amusements/Games
License: LGPL
URL: http://www.test.com
Source0: $RPM_SOURCE_ROOT/Memory_Game-%{version}
BuildRoot:$RPM_BUILD_ROOT/%{name}-root
BuildArch: noarch

%description
This is a memory game programmed in java to run on linux.Enjoy!

%prep

%build


%install
pwd
rm -rf $RPM_BUILD_ROOT
mkdir -p $RPM_BUILD_ROOT/usr/local/bin/YGames/Memory
mkdir -p $RPM_BUILD_ROOT/usr/local/bin/YGames/Memory/images
mkdir -p $RPM_BUILD_ROOT//usr/share/applications/
cd $RPM_BUILD_ROOT/usr/local/bin/YGames/Memory
cp /home/ymohamed/workspace/rpm/SOURCES/Memory_Game-%{version}.jar .
cp /home/ymohamed/workspace/rpm/SOURCES/lion.jpg .
cd $RPM_BUILD_ROOT/usr/local/bin/YGames/Memory/images
cp /home/ymohamed/workspace/rpm/SOURCES/images/* .
cd $RPM_BUILD_ROOT/usr/share/applications/
cp /home/ymohamed/workspace/rpm/SOURCES/MemoryGame.desktop .


%clean
rm -rf /home/ymohamed/rpmbuild

%changelog

%files
%defattr(775,root,root,-)
/usr/local/bin/YGames/Memory/Memory_Game-%{version}.jar
/usr/local/bin/YGames/Memory/lion.jpg
/usr/local/bin/YGames/Memory/images/*
/usr/share/applications/MemoryGame.desktop

%doc


